package com.fidelity.email;

public class EmailGenerator {

	public static void main(String[] args) {
		EmailGenerator g = new EmailGenerator();
		// In all cases, expected output is doe.jane@fidelity.com
		System.out.println(g.makeEmailFromName("Jane Doe"));
		System.out.println(g.makeEmailFromName("Jane Doe"));
		System.out.println(g.makeEmailFromName(" Jane Doe"));
		System.out.println(g.makeEmailFromName("Jane Doe "));
	}

	/* (non-Javadoc)
	 * @see com.fidelity.email.emainint#makeEmailFromName(java.lang.String)
	 */
	public String makeEmailFromName(String name) {
		return name;
	}

}
