package spring.logpage;

public class LogMessageObj {
	private int lineNumber;
	private String timestamp;
	private String prefixMdc;
	private String level;
	private String category;
	private String thread;
	private String message;

	public LogMessageObj() {
	}

	public LogMessageObj(int lineNumber, String timestamp, String prefixMdc,
			String level, String category, String thread, String message) {
		super();
		this.lineNumber = lineNumber;
		this.timestamp = timestamp;
		this.prefixMdc = prefixMdc;
		this.level = level;
		this.category = category;
		this.thread = thread;
		this.message = message;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getPrefixMdc() {
		return prefixMdc;
	}

	public void setPrefixMdc(String prefixMdc) {
		this.prefixMdc = prefixMdc;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getThread() {
		return thread;
	}

	public void setThread(String thread) {
		this.thread = thread;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
