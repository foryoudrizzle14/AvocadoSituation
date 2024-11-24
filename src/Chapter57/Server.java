package Chapter57;

import java.net.ServerSocket;

public class Server {

    public static void main(String[] args) {
        //TODO: 서버 소켓 생성
        //TODO: 클라이언트 접속 대기
        try(ServerSocket serverSocket = new ServerSocket(8888)) {

        }


        System.out.println("서버가 시작되었습니다.");
        System.out.println("클라이언트가 접속하였습니다.")

        //TODO:클라이언트로 부터 데이터를 받기위한 inputStream 생성

        //TODO: 클라이언트로 데이터를 보내기 위한 OutputStream 생성

        //inputLine:
        String inputLine;

        //TODO: 클라이언트로 부터 데이터를 읽고 화면에 출력

        //TODO: 클라이언트로 응답을 보냄
    }
}
