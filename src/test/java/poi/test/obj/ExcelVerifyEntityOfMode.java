package poi.test.obj;

import org.apache.commons.lang3.builder.ToStringBuilder;

import cn.afterturn.easypoi.handler.inter.IExcelModel;

public class ExcelVerifyEntityOfMode extends ExcelVerifyEntity implements IExcelModel {

    private String errorMsg;

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    
    @Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }

}
