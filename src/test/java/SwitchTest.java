import org.junit.Test;

public class SwitchTest{
	enum e{
		ONE
	}
	byte b=1;		//byte可以
	short s=1;		//short可以
	int i=1;		//int可以
	char c='1';		//char可以
	e e1=e.ONE;		//enum可以
	long l= 1L;		//long不可以
	float f=1f;		//float不可以
	double d=1d;	//double不可以
	String str="1";	//String不可以

	@Test
	public void testSwitchByte_Short_Int_Char_Enum(){
		//byte可以
		switch(b) {
			case 1:System.out.println("byte");break;
			default:System.out.println("NULL");
		}
		//short可以
		switch(s) {
			case 1:System.out.println("short");break;
			default:System.out.println("NULL");
		}
		//int可以
		switch(i) {
			case 1:System.out.println("int");break;
			default:System.out.println("NULL");
		}
		//enum可以
		switch(e1) {
			case ONE:System.out.println("enum");break;
			default:System.out.println("NULL");
		}
	}

    /*
	@Test
	public void testSwitchLong_Float_Double_String(){
		//long可以
		switch(l) {
			case 1L:System.out.println("long");break;
			default:System.out.println("NULL");
		}
		//float可以
		switch(f) {
			case 1f:System.out.println("float");break;
			default:System.out.println("NULL");
		}
		//double不可以
		switch(d) {
			case 1d:System.out.println("double");break;
			default:System.out.println("NULL");
		}
		//String不可以
		switch(str) {
			case "1":System.out.println("String");break;
			default:System.out.println("NULL");
		}
	}
    */

	@Test
	public void testCase(){
		int i=0,j=-1;
		switch(i){
			// case 0,1:j=1;
			case 2:j=2;
		}
		System.out.print("j="+j);

	}
}
