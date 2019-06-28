import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ��18-2 �t�@�C�����ɓ���̕�������܂�ł��邩�ǂ����𒲂ׂ�v���O����
 */
public class FindFile1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("�g�p��:Java Find1 ���������� < �����Ώۃt�@�C��");
            System.out.println("��:java Find1 System < Find1.java");
            System.exit(0);
        }
        String keyword = args[0];
        System.out.println("����������́u" + keyword + "�v�ł��B");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String r_line;
            int i = 1;
            while ((r_line = reader.readLine()) != null) {
                if (r_line.contains(keyword)) {
                    System.out.println(i + ":" + r_line);
                    //�ǂݍ��݃t�@�C�������
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
