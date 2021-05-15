package B6;

import B3.MyFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class QuanLyTS {
    Scanner scanner=new Scanner(System.in);
    private LinkedList<ThiSinh> list;

    public QuanLyTS() {
        list=new LinkedList<ThiSinh>();
    }

    public ThiSinh newTS(){
        System.out.print("Id: ");int id=scanner.nextInt();scanner.nextLine();
        System.out.print("Name: ");String name=scanner.nextLine();
        System.out.print("Age: ");int age=scanner.nextInt();
        System.out.print("Sex: ");char sex=scanner.next().charAt(0);scanner.nextLine();
        System.out.print("Address: ");String address=scanner.nextLine();

        ThiSinh v=new ThiSinh(id,name,age,sex,address);

        return v;
    }

    public void add(ThiSinh v){
        if(!list.contains(v)){
            list.add(v);
        }
        sx();
    }

    public void sx(){
        Collections.sort(list,(v1,v2)-> v1.getID()>v2.getID() ? 1:- 1);
    }

    public void show(){
        sx();
        System.out.println("Danh sach: ");
        list.forEach((i)-> System.out.println(i.toString()));
    }

    public ThiSinh search(ThiSinh v){
        return list.get(list.indexOf(v));
    }

    public ThiSinh search(int v){
        return list.get(v);
    }

    public void remove(ThiSinh v){
        list.remove(v);
    }

    public void update(ThiSinh v){
        System.out.println("1-Set name\n2-Set age\n3-Set id\n4-Set sex\n5-Set address");
        try{
            System.out.print("chon: ");int chon=scanner.nextInt();
            if(chon==1){
                System.out.print("name: ");String name=scanner.nextLine();
                search(v).setName(name);
            }
            else if(chon==2){
                System.out.print("age: ");int age=scanner.nextInt();
                search(v).setAge(age);
            }
            else if(chon==3){
                System.out.print("id: ");int id=scanner.nextInt();
                search(v).setID(id);
            }
            else if(chon==5){
                System.out.print("address: ");String address=scanner.next();
                search(v).setAddress(address);
            }
            else if(chon==4){
                System.out.print("sex: ");char sex=scanner.next().charAt(0);
                search(v).setSex(sex);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public void writeFile(String address,String name) throws IOException {
        String str=address+"\\"+name;
        RandomAccessFile file=null;
        try{
            file=new RandomAccessFile(str,"rw");
             if(file.length()==0){
                 for(int i=0;i<list.size();i++){
                     file.write((list.get(i).toString()).getBytes(StandardCharsets.UTF_8));
                 }
             }
             else{
                 MyFile.cutFileVanBan(MyFile.newFile(address,name,""),new File(str));

                 for(int i=0;i<list.size();i++){
                     file.write((list.get(i).toString()).getBytes(StandardCharsets.UTF_8));
                 }
             }
            System.out.println("Ghi xg");

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            file.close();
        }
    }

    public void readFile(String address,String name) throws IOException {
        String str=address+"\\"+name;
        FileInputStream file=null;
        BufferedReader br=null;

        try{
            file=new FileInputStream(str);
            br=new BufferedReader(new InputStreamReader(file,"UTF-8"));

            int i=0;String data = "";
            while((i= br.read())!=-1){
                if((char)i=='.'&& i!=10){
                    String t[]=data.split(" - ");
                    add(new ThiSinh(Integer.parseInt(t[0]),t[1],Integer.parseInt(t[2]),t[3].charAt(0),t[4]));
                    data="";
                }
                else{
                    data+=(char)i;
                }
            }
            System.out.println("doc xg");

        } catch (FileNotFoundException e) {
            System.out.println("File k ton tai");
        } finally {
            file.close();
            br.close();
        }
    }

    public void star() throws IOException {
        try{
            readFile("C:\\Users\\admin\\Desktop\\BtJava\\Tuan6\\src\\B6","thisinh.dat");

            while(true){
                System.out.println("1-Add\n2-Show\n3-Search\n4-Remove\n5-Update\n6-Write File\n7-Read File\nNgoai khoang 1->7 de ket thuc");

                try{
                    System.out.print("chon: ");int chon=scanner.nextInt();
                    if(chon==1){
                        add(newTS());
                    }
                    else if(chon==2){
                        show();
                    }
                    else if(chon==3){
                        System.out.println("1-Tim theo vt\n2-Tim theo doi tuong");
                        System.out.print("chon: ");int c=scanner.nextInt();
                        if(c==1){
                            System.out.print("vt: ");int vt=scanner.nextInt();
                            ThiSinh v=search(vt);
                            System.out.println("Contains: "+list.contains(v)+" - "+"Index: "+list.indexOf(v)+" - Ts: "+v.toString());
                        }
                        else if(c==2){
                            ThiSinh v=newTS();
                            System.out.println("Contains: "+list.contains(v)+" - "+"Index: "+list.indexOf(v)+" - Ts: "+search(v).toString());

                        }
                    }
                    else if(chon==4){
                        System.out.println("1-Xoa theo vt\n2-Xoa theo doi tuong");
                        System.out.print("chon: ");int c=scanner.nextInt();
                        if(c==1){
                            System.out.print("vt: ");int vt=scanner.nextInt();
                            remove(search(vt));
                        }
                        else if(c==2){
                            remove(newTS());
                        }
                    }
                    else if(chon==5){
                        System.out.print("vt: ");int vt=scanner.nextInt();
                        ThiSinh v=search(vt);
                        update(v);
                    }
                    else if(chon==6){
                        System.out.print("Nhap duong dan: ");String a=scanner.next();
                        System.out.print("Nhap ten file: ");String n=scanner.next();
                        writeFile(a,n);
                    }
                    else if(chon==7){
                        System.out.print("Nhap duong dan: ");String a=scanner.next();
                        System.out.print("Nhap ten file: ");String n=scanner.next();
                        readFile(a,n);
                    }
                    else{
                        System.out.println("Luu file va dung chuong trinh");
                        writeFile("C:\\Users\\admin\\Desktop\\BtJava\\Tuan6\\src\\B6","thisinh.dat");
                        break;
                    }
                } catch (Exception e) {
                    System.out.println(e);
                    break;
                } finally {
                    System.out.println("--------------------------------------------------------------------------------");
                }
            }

        }catch (NullPointerException e){
            System.out.println("Dang tao file \"thisinh.dat\".........\nVui long chay lai");
            MyFile.newFile("C:\\Users\\admin\\Desktop\\BtJava\\Tuan6\\src\\B6","thisinh.dat","");
        }
    }
}
