
public class Vagone{
	private String classe;
	private int nPostiMax,postiOccupati;
	
	
	
	public Vagone(String classe, int nPostiMax) {
		this.classe = classe;
		this.nPostiMax = nPostiMax;
	}


    
	
	@Override
	public String toString() {
		return "Vagone [classe=" + classe + "\nnPostiMax=" + nPostiMax + ", postiOccupati=" + postiOccupati + "]";
	}

     


	public String getClasse() {
		return classe;
	}




	public void setClasse(String classe) {
		this.classe = classe;
	}




	public int getnPostiMax() {
		return nPostiMax;
	}




	public void setnPostiMax(int nPostiMax) {
		this.nPostiMax = nPostiMax;
	}




	public int getPostiOccupati() {
		return postiOccupati;
	}




	public void setPostiOccupati(int postiOccupati) {
		this.postiOccupati = postiOccupati;
	}




	public static void main(String[] args) {
       	Vagone v1= new Vagone("prima", 20);
       	Vagone v2= new Vagone("seconda", 18);
       	System.out.println(v1);
       	System.out.println(v2);
		
	}
	
}
