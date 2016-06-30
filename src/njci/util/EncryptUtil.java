package njci.util;

import java.security.MessageDigest;


public class EncryptUtil {
	public final static String md5Crypt(String inputString){
		char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		try {
			byte[] input = inputString.getBytes();
			
			// ���MD5ժҪ�㷨�� MessageDigest ����
			MessageDigest md5Instance = MessageDigest.getInstance("MD5");
			
			// ʹ��ָ�����ֽڸ���ժҪ
			md5Instance.update(input);
			
			// �������
			byte[] md5 = md5Instance.digest();
			
			// ������ת����ʮ�����Ƶ��ַ�����ʽ
			int j = md5.length;
			char str[] = new char[j*2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md5[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
