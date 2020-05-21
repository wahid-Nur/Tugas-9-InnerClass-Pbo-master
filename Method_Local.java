class Method_Local{
    public static void main (String[] args){
	Outer o = new Outer();
	o.tampil();
	}
}
class Outer{
    static String text="we will not go down";
    String textDua="in the night, without the fight";
	
	void tampil(){
	final String str = "for gaza";
	
	class Local{
	Local()
	{
	System.out.println(str);
	System.out.println(text);
	System.out.println(textDua);
	}
	}
	new Local();
	}
}
