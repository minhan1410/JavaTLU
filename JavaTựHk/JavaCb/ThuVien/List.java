package ThuVien;

public class List{
    private Node head;

    public List() {
        head = null;
    }

    public void Add(ThongTin v){
        Node a=new Node();
        a.setData(v);

        if(head==null){
            head = a;
        }
        else{
            Node p=head;
            while(p.getNext()!=null){
                p=p.getNext();
            }
            p.setNext(a);
        }
    }

    public void Add(ThongTin v,int vt){
        if(vt<Count()){
            Node a=new Node();
            a.setData(v);
    
            Node p=head;
            if(vt==0){
                a.setNext(p);
                head=a;
            }
            else{
                for(int i=0;i<vt-1;i++){
                    p=p.getNext();
                }   
                a.setNext(p.getNext());
                p.setNext(a);
            }
        }
    }

    public int Count(){
        int d=0;
        Node a=head;
        while(a!=null){
            d++;
            a=a.getNext();
        }
        return d;
    }

    public void Show(){
        Node p=head;
        while(p!=null){
            System.out.println(p.getData());
            p=p.getNext();
        }
    }

    public void Delete(int vt){
        if(vt<Count()){
            if(vt==0){
                head=head.getNext();
            }
            else{
                Node p=head;
                for(int i=0;i<vt-1;i++){
                    p=p.getNext();
                }
                p.setNext(p.getNext().getNext());
            }
        }
    }
    
    public ThongTin TkThongTin(int vt){
        Node p=head;
        for(int i=0;i<vt;i++){
            p=p.getNext();
        }
        return p.getData();
    }

    public int TkViTri(ThongTin v){
        Node p=head;int d=0;
        while(p!=null){
            if(p.getData().equals(v)){
                return d;
            }
            d++;p=p.getNext();
        }
        return -1;
    }
}