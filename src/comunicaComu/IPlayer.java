package comunicaComu;


import utils.Array;

public interface IPlayer {
Estats login(String user,String pass);
Array<Room> getRooms(Room.Tipus tipus);
Estats joinRoomSetimig(Room room);
Array<LobbyGame> getRoomGames(Room room);
Estats joinGame(LobbyGame lobbyGame);
Estats createGame(LobbyGame lobbyGame);

}
