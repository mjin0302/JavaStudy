package com.yedam.board;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {

 	String FROM = "xkq3355@naver.com"; // 보낸사람
    String FROMNAME = "박선아";
    String TO = "xkq3355@gmail.com"; // 받는사람
    String SMTP_USERNAME = "xkq3355@naver.com"; // 보낸사람
    
    String SMTP_PASSWORD = "xkfh8215@@"; // 보낸사람 비밀번호 입력해줘야함
    
    String HOST = "smtp.naver.com";
    int PORT = 587;
    
    String SUBJECT = "DEV 개발자 커뮤니티의 회원정보";
    String userId = null;
    String userPass = null;
    
    
//    String BODY = String.join(
//        System.getProperty("line.separator"),
//        "<h1>"+ userId + "님의 회원정보" +"</h1>",
//        "<h3> " + "아이디: " + userId +"</h3>",
//        "<h3>" + "비밀번호: " + userPass + "</h3>"
//    );
    
    public Mail(String TO, String userId, String userPass) {
    	this.TO = TO;
    	this.userId = userId;
    	this.userPass = userPass;
    }
    
    public void sendMail() throws Exception {
        Properties props = System.getProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.port", PORT); 
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(props);
        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(FROM, FROMNAME));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
        msg.setSubject(SUBJECT);
        
        String BODY = String.join(
                System.getProperty("line.separator"),
                "<h1>"+ userId + "님의 회원정보" +"</h1>",
                "<h3> " + "아이디: " + userId +"</h3>",
                "<h3>" + "비밀번호: " + userPass + "</h3>"
            );
        
        msg.setContent(BODY, "text/html;charset=euc-kr");
        
        Transport transport = session.getTransport();
        try {
            System.out.println("Sending...");
            
            transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
            transport.sendMessage(msg, msg.getAllRecipients());
            System.out.println("Email sent!");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            transport.close();
        }
    }
}
