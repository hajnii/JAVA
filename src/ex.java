import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("첫번째 숫자를 입력하세요\n" +
                "(입력)");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.print("사칙견산자를 고르세요\n"
                + "1. + (더하기)\n"
                + "2. - (빼기)\n"
                + "3. * (곱하기)\n"
                + "4. / (나누기)\n");
        String op = (String)reader.readLine();
        System.out.print("두번째 숫자를 입력하세요\n" +
                "(입력)");
        int num2 = Integer.parseInt(reader.readLine());
        int result = 0;
        String op_text = "";
        switch(op) {
            case "1" : result = num1 + num2;
                op_text="+";
                break;
            case "2" : result = num1 - num2;
                op_text="-";
                break;
            case "3" : result = num1 * num2;
                op_text="*";
                break;
            case "4" : result = num1 / num2;
                op_text="/";
                break;
            default : System.out.println("제대로 입력 해주세요.");
        }
        System.out.printf("%d %s %d = %d", num1 , op_text ,num2, result);
    }
}
