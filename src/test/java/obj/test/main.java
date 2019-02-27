package obj.test;

import org.springframework.beans.BeanUtils;

import com.yunyitg.cesp.common.utils.FastJsonUtils;
import com.yunyitg.cesp.core.imports.list.entity.ElistDetailInfo;

public class main {

	public static void main(String[] args) {
		
//		System.out.println("跨境电商服务平台");
		
		ElistDetailInfo info = new ElistDetailInfo();
//		info.seteListHeadId(11);
		
		Obj obj = new Obj();
//		obj.seteListHeadId(11);
		BeanUtils.copyProperties(info, obj);
		System.out.println(obj.geteListHeadId());
		
		System.out.println(FastJsonUtils.toJSONString(info));
 	}
	
	static class Obj{
		
		private Integer eListHeadId;
		
	
		public Integer geteListHeadId() {
			return eListHeadId;
		}
		
		public void seteListHeadId(Integer eListHeadId) {
			this.eListHeadId = eListHeadId;
		}
	}
	
}
