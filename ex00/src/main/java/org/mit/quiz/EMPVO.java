package org.mit.quiz;

import java.sql.Date;

import lombok.Data;

@Data
public class EMPVO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hireDate;
	private int sal;
	private int comm;
	private int deptno;
}
