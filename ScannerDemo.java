/**
 * @author Christelle
 * 
 */
public class ScannerDemo {

	private static String file1 = "C:\\Users\\xxlal\\eclipse-workspace\\ParserScannerOriginal\\src\\tester.txt";
	private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);
		Token tok=new Token();

		System.out.println(file1);

		while (!ts.isEndofFile()) {
			tok=ts.nextToken();
			if(tok.getType().equals("Comment")) {
				continue;
			}
			if(tok.getType().equals("Other")) {
				System.out.println("Value: "+tok.getValue()+"  --> Lexical Error");
				continue;
			}
			System.out.println("Token "+counter+" -->  Value: "+tok.getValue()+"   Type: "+tok.getType());
			counter++;
		}
	}
}
