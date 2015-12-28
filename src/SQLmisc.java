
public class SQLmisc {
	enum Estat {NotConnected,ok,ko}
	protected Estat connect(){
		return Estat.ok;
	}
	public static synchronized Estat login(String user, String pass){
		return Estat.ok;
	}

}
