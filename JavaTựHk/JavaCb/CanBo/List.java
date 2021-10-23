package CanBo;

public class List {
    private Officer officer[] = new Officer[100];
    private int index;

	public List() {
        for(int i =0;i<100;i++) {
            officer[i]=new Officer();
        }
        index = 0;
    }
    
    public void Add(Officer v){
        officer[index++]=v;
    }

    public void Remove(int vt){
        for(int i=vt; i<index;i++){ 
            officer[i]=officer[i+1];
        }
        index--;
    }

    public Officer SearchName(String name){
        for(int i=0;i<index;i++){
            if(officer[i].getName().equals(name)){
                return officer[i];
            }
        }
        return null;
    }

    public void Show(){
        for(int i=0; i<index; i++){
            System.out.println(officer[i].toString()+"\n");
        }
    }
}
