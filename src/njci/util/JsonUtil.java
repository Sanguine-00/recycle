package njci.util;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class JsonUtil {
	// ת��ΪJson��ʽ
	@SuppressWarnings("unchecked")
	public static void jsonFromList(List list, Integer total) throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json;charset=utf-8");

		// JSONObject jobj = new JSONObject();// newһ��JSON
		// jobj.accumulate("total", total);// total���һ���ж������
		// jobj.accumulate("rows", list);// row�Ǵ����ʾ��ҳ�����

		String json = JSON.toJSONString(list,
				SerializerFeature.WriteMapNullValue,
				SerializerFeature.WriteDateUseDateFormat);
		response.setCharacterEncoding("utf-8");// 指定为utf-8
		response.getWriter().write(json);// ת转化为JSON格式
		response.getWriter().flush();
		System.out.println(json);
	}

	public static void jsonFromObject(Object object) throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json;charset=utf-8");
		JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
		// JSONObject jobj = JSONObject.fromObject(object);
		String json = JSON.toJSONString(object,
				SerializerFeature.WriteMapNullValue,
				SerializerFeature.WriteDateUseDateFormat);
		response.setCharacterEncoding("utf-8");// 指定为utf-8
		response.getWriter().write(json);// ת转化为JSON格式
		response.getWriter().flush();
		System.out.println(json);
	}

	public static void jsonArrayFromObject(Object object) throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json;charset=utf-8");

		JSONArray jsonArray = JSONArray.fromObject(object);
		response.setCharacterEncoding("utf-8");// 指定为utf-8
		response.getWriter().write(jsonArray.toString());// ת转化为JSON格式
		response.getWriter().flush();
		System.out.println(jsonArray.toString());
	}

	public static void jsonFromMapString(Map<String, String> map)
			throws Exception {
		// StringBuilder json = new StringBuilder();
		// json.append("{");
		// if (map != null && map.size() > 0) {
		// for (Object key : map.keySet()) {
		// json.append("\"" + key + "\"");
		// json.append(":");
		// json.append("\"" + map.get(key) + "\"");
		// json.append(",");
		// }
		// json.setCharAt(json.length() - 1, '}');
		// } else {
		// json.append("}");
		// }

		JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
		// JSONObject jobj = JSONObject.fromObject(object);
		String json = JSON.toJSONString(map,
				SerializerFeature.WriteMapNullValue,
				SerializerFeature.WriteDateUseDateFormat);

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		System.out.println(json);
		response.getWriter().write(json);
		response.getWriter().flush();

	}

}
