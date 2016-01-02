package comunicaComu;

import comunicaServer.LobbyGame;
import comunicaServer.Room;
import utils.Array;

public interface IPlayer {
Estat login(String user,String pass);
Estat join(String user,String pass);
Array<Room> getRooms(Room.Tipus tipus);
Estat joinRoomSetimig(Room room);
Array<LobbyGame> getRoomGames(Room room);
Estat joinGame(LobbyGame lobbyGame);
Estat createGame(LobbyGame lobbyGame);

}
