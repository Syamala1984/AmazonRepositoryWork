/**
 * 
 */
package com.springboot.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Syamala84
 *
 */
@XmlRootElement(name="activity")
public class Activity {
	
	@XmlElement
	private Long id;

	@XmlElement
	private int duration;

	@XmlElement
	private String description;

	public Activity() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id
	 * @param duration
	 * @param description
	 */
	public Activity(Long id, int duration, String description) {
		super();
		this.id = id;
		this.duration = duration;
		this.description = description;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 *            the duration to set
	 */

	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */

	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Activity [id=" + id + ", duration=" + duration + ", description=" + description + "]";
	}

}
