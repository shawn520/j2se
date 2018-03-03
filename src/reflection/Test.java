

package reflection;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {

		//��spring.txt�л�ȡ�����ƺͷ�������
		File springConfigFile = new File("C:\\Users\\liush\\Documents\\workspace\\j2se\\src\\spring.txt");
		Properties springConfig= new Properties();
		springConfig.load(new FileInputStream(springConfigFile));
		String className = (String) springConfig.get("class");
		String methodName = (String) springConfig.get("method");
		
		//���������ƻ�ȡ�����
		Class clazz = Class.forName(className);
		//���ݷ������ƣ���ȡ��������
		Method m = clazz.getMethod(methodName);
		//��ȡ������
		Constructor c = clazz.getConstructor();
		//���ݹ�������ʵ����������
		Object service = c.newInstance();
		//���ö����ָ������
		m.invoke(service);
		
	}
}
