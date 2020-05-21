class Out {
    public double hasil(int nilai_out,int nilai_in){
	double yang_dicari = nilai_out * nilai_in;
	return yang_dicari;
}
class In {
    void methodnya(int x,int y){
	x = 15;
	y = 5;
	double outputnya = hasil(x , y);
		System.out.println(outputnya);
		}
	}
}
public class InnerClass {
   public static void main(String[] args) {
	int a = 0;
	int b = 0;
	Out classOut = new Out();
	Out.In classIn = classOut.new In();
	classIn.methodnya(a , b);
	}
}