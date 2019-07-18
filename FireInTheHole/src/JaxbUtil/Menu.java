package JaxbUtil;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Menu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -752880687726602514L;
	
	private String menuName;
	
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date menuDate;

	
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Menu(String menuName, Date menuDate) {
		super();
		this.menuName = menuName;
		this.menuDate = menuDate;
	}
	
	

}
