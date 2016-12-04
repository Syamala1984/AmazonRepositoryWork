/**
 * 
 */
package com.springboot.xml;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Syamala84
 *
 */
@RestController
public class ActivityController {

	private static final Logger log = LoggerFactory.getLogger(ActivityController.class);

	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	@ResponseStatus(HttpStatus.OK)
	public List<Activity> getAllActivities() {
		log.info("\n##########  getAllActivities  ###########\n");
		List<Activity> activityList = new ArrayList<Activity>(3);
		// ArrayList<Activity> activityList = new ArrayList<Activity>(3);

		log.info("\n##########  activityList.size  ###########\n" + activityList.size());

		activityList.add(0, new Activity(new Long(1), 23, "Activity One"));
		activityList.add(1, new Activity(new Long(2), 21, "Activity Two"));
		activityList.add(2, new Activity(new Long(3), 23, "Activity Three"));

		return activityList;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST, headers = "content-type=application/xml",
			consumes={MediaType.APPLICATION_XML_VALUE}, produces={MediaType.APPLICATION_XML_VALUE})
	public Activity save(@RequestBody Activity activity) {
		log.info("\n##########  save  ###########\n");
		log.info("\n##########  Activity  ###########\n" + activity.toString());

		return activity;
	}

}
