package networking;

import java.io.*;
import java.net.*;

class PortScanner{
	
	public static void main(String args[])
{
       int start,stop,count=0;
start=Integer.parseInt(args[0]);
stop=Integer.parseInt(args[1]);

for(int i=start;i<stop;i++)

{
        try
{
        Socket s=new Socket("127.0.0.1",i);
        System.out.println("port"+i+"is busy");

}
catch(Exception e)
{
count ++;
}
}

System.out.println("no. of ports are not busy");
}
}
