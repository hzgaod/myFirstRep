package JaxbUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date>{

	private static final SimpleDateFormat SDF=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@Override
	public Date unmarshal(String var1) throws Exception {
		
		return SDF.parse(var1);
	}

	@Override
	public String marshal(Date var1) throws Exception {
		
		return SDF.format(var1);
	}

}
