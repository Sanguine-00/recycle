package njci.util;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

public class JsonUtil {
	//ת��ΪJson��ʽ  
    @SuppressWarnings("unchecked")
	public static void jsonFromList(List list,Integer total) throws Exception{  
         HttpServletResponse response = ServletActionContext.getResponse();  
         response.setContentType("application/json;charset=utf-8");
         
         JSONObject jobj = new JSONObject();//newһ��JSON  
         jobj.accumulate("total",total );//total���һ���ж������  
         jobj.accumulate("rows", list);//row�Ǵ����ʾ��ҳ�����  

         response.setCharacterEncoding("utf-8");//ָ��Ϊutf-8  
         response.getWriter().write(jobj.toString());//ת��ΪJSOn��ʽ  
         response.getWriter().flush();  
         System.out.println(jobj.toString());  
    }
    
    public static void jsonFromObject(Object object) throws Exception{  
        HttpServletResponse response = ServletActionContext.getResponse();  
        response.setContentType("application/json;charset=utf-8");
        
        JSONObject jobj = JSONObject.fromObject(object);
        response.setCharacterEncoding("utf-8");//指定为utf-8
        response.getWriter().write(jobj.toString());//ת转化为JSON格式 
        response.getWriter().flush();  
        System.out.println(jobj.toString());  
   }  
    public static void jsonArrayFromObject(Object object) throws Exception{  
        HttpServletResponse response = ServletActionContext.getResponse();  
        response.setContentType("application/json;charset=utf-8");
        
        JSONArray jsonArray = JSONArray.fromObject(object);
        response.setCharacterEncoding("utf-8");//指定为utf-8
        response.getWriter().write(jsonArray.toString());//ת转化为JSON格式 
        response.getWriter().flush();  
        System.out.println(jsonArray.toString());  
   }  
}
