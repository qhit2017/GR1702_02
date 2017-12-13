package lijingjing;

public class TongXun {
//
	private String name;
	private String xingbie;
	private String dianhua;
	
	public TongXun() {
		super();
	}

	public TongXun(String name, String xingbie, String dianhua) {
		super();
		this.name = name;
		this.xingbie = xingbie;
		this.dianhua = dianhua;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getXingbie() {
		return xingbie;
	}

	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}

	public String getDianhua() {
		return dianhua;
	}

	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}

	@Override
	public String toString() {
		return "TongXun [name=" + name + ", xingbie=" + xingbie + ", dianhua="
				+ dianhua + "]";
	}
	
}
