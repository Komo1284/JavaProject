package model.vo;

public class JoinVO {
	private int idx,dep_idx;
	private String name, position, dep_name,dep_phone;
	
	@Override
	public String toString() {
		String msg = "%d %s %s %d %s %s";
		msg = String.format(msg, idx, name, position, dep_idx, dep_name, dep_phone);
		
		return msg;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getDep_idx() {
		return dep_idx;
	}

	public void setDep_idx(int dep_idx) {
		this.dep_idx = dep_idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public String getDep_phone() {
		return dep_phone;
	}

	public void setDep_phone(String dep_phone) {
		this.dep_phone = dep_phone;
	}
	
	
	
	
}
