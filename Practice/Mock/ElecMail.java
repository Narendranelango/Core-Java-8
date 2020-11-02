class Email {
	private String from;
	private String to;
	private String subject;
	private String body;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Email [from=" + from + ", to=" + to + ", subject=" + subject + ", body=" + body + "]";
	}
}
class Sender <T>{
private T message;

public T getMessage() {
	return message;
}

public void setMessage(T message) {
	this.message = message;
}
public void sendMessage()
{
	System.out.println("Message Type: "+getMessage().getClass());
	System.out.println("Contents are:"+getMessage());
}
}


public class ElecMail{
	public static void main(String[] args) {
	Sender<String> s1=new Sender<>();
	s1.setMessage("Message da!!!!!!!");
//	System.out.println(s1.getMessage());
	s1.sendMessage();
	Email myEmail = new Email();
    myEmail.setFrom("test@igate.com");
    myEmail.setTo("admin@igate.com");
    myEmail.setSubject("Need to block cafeteria for personal event");
    myEmail.setBody("To celebrate IGATE birthday!");
	Sender<Email> s2=new Sender<>();
	s2.setMessage(myEmail);
//	System.out.println(s2.getMessage());
	s2.sendMessage();
	}
}						