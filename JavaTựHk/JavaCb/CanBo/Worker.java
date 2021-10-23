package CanBo;

public class Worker extends Officer {
    private int bac;

	public Worker(int bac) {
        if(bac>=1 && bac<=10)
		    this.bac = bac;
	}

	public Worker(String name, String sex, String address, int age, int bac) {
		super(name, sex, address, age);
		if(bac>=1 && bac<=10)
		    this.bac = bac;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	@Override
	public String toString() {
		return "\n"+super.toString()+" -- Worker [bac=" + bac + "]";
	}
    
}