
public class LobbyPlayer {
	enum Estat {ok,ko,UsuarioExistente,UsuarioInexistente}
	public  Estat login(String user,String pass){
		return Estat.ok;
	}
}
