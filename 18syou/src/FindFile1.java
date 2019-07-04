import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

/**
 * ��18-2 �t�@�C�����ɓ���̕�������܂�ł��邩�ǂ����𒲂ׂ�v���O����
 */
public class FindFile1 {
    public static void main(String[] args) {
        if (args.length !=2) {  //�u�C���v1�˂Q�ɕύX
            System.out.println("�g�p�@:Java FindFile1 ����������  �����Ώۃt�@�C��");  //�u�C���vFindFile1�ɕύX
            System.out.println("��:java FindFind1 System FindFile1.java"); //�u�C���vFindFile1�ɕύXcd
            System.exit(0);
        }
        String keyword = args[0];
        String filename = args[1];
        System.out.println("����������́u" + keyword + "�v�ł��B");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename)); //�u�C���vtry�̒��Ɉړ�
            String r_line;
            int i = 1;
            while ((r_line = reader.readLine()) != null) {
                if (r_line.contains(keyword)) {
                    System.out.println(i + ":" + r_line);
                }
                i++;
            }
            reader.close();
        } catch (FileSystemNotFoundException e) { //�u�C���v  �t�@�C�����J���Ȃ������ꍇ�̗�O������ǉ�
            System.out.println("�t�@�C����������܂���" + e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
