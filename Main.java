package mulesoft;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
public static void main(String [] args) {
	createtable.createNewTable();
	insert("  VIKRAM VEDHA","  madhavan  ","Vijay Sethupathi    ",2019,"Pushkar");
	insert("  okok  ","UDHAY",nyan            ",2012,"Vignesh Shivan");
	insert("Master"," VJ","Nyann",2020,"Lokesh");
	insert("Thuppaki","Vj   ","Kajal       ",2016,"Murugadoss");
	insert("Bigil    ","Vj   ","Nyan    ",2019,"Atlee");
	select.selectAll();
	select.selectactormovie();
}
private static void insert(String moviename,String leadactor,String actress,Integer yearofrelease,String director) {
	Connection con=Dbconnection.connect();
	PreparedStatement ps=null;
	try {
		String sql="INSERT INTO movies(moviename,leadactor,actress,yearofrelease,director) VALUES(?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, moviename);
		ps.setString(2, leadactor);
		ps.setString(3, actress);
		ps.setInt(4,yearofrelease);
		ps.setString(5, director);
		ps.execute();
		System.out.println("Data has been inserted");
	}catch(SQLException e) {
		System.out.println(e.toString());
	}
}
}
