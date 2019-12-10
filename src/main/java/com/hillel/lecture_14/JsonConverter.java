package com.hillel.lecture_14;

import java.util.List;

/**
 * Create json converter. User object should be present in key-value pair, all field should be like Map;
 * F.E:
 * public class User {
 *
 *     private String name;
 *
 * }
 *
 * Should be present as json {"name": "bob"}
 * @see <a href="https://www.w3schools.com/whatis/whatis_json.asp">JSON</a>
 */
public class JsonConverter {


    public String convertToJsonString(List<User> users) {

        String result = "\"[";
        for (int i = 0; i <  users.size();i++) {
            if (i != 0) {
                result += ",";
            }
            result += convertUserToJson(users.get(i));
        }
        result += "]\"";

        return result;
    }

    private String convertUserToJson(User user) {
        String result = "{";
        result += "\"id\":"+ user.getId();
        result += ",";
        result += "\"firstName\":\"" + user.getFirstName() + "\"";
        result += ",";
        result += "\"lastName\":\"" + user.getLastName() + "\"";
        result += ",";
        result += "\"age\":" + user.getAge();
        result += ",";
        result += "\"gender\":\"" + user.getGender() + "\"";
        result += ",";
        result += "\"company\":\"" + user.getCompany() + "\"";
        result += ",";
        result += "\"email\":\"" + user.getEmail() + "\"";
        result += ",";
        result += "\"phone\":[";
        for (int i = 0; i <  user.getPhone().size();i++) {
            if (i!= 0){
                result += ",";
            }
            result += "\"" + user.getPhone().get(i) + "\"";
        }
        result += "]";
        result += ",";
        result += "\"address\":{\"city\":\"" + user.getAddress().getCity();
        result += "\",\"street\":\"" + user.getAddress().getStreet() + "\"}";
        result += ",";
        result += "\"friends\":[";
        for (int i = 0; i <  user.getFriends().size();i++) {
            if (i != 0) {
                result += ",";
            }
            Friend friend = user.getFriends().get(i);
            result += "{\"id\":" + friend.getId();
            result += ",";
            result += "\"firstName\":\"" + friend.getFirstName() +"\"";
            result += ",";
            result += "\"lastName\":\"" + friend.getLastName() +"\"}";

        }
        result += "]";

        result += "}";
        return result;
    }

    public String convertToJsonString(User user) {

        String result = "\"";
        result += convertUserToJson(user);
        result += "\"";
        return result;
    }


}
