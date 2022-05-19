package P72410;

class oognuyh {

    public String solution(String new_id) {
        new_id = new_id.toLowerCase()
            .replaceAll("[^a-z0-9-_.]", "")
            .replaceAll("[.]{2,}", ".")
            .replaceAll("^[.]|[.]$", "");

        if (new_id.isEmpty()) {
            new_id = "a";
        } else if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15)
                .replaceAll("[.]$", "");
        } 
        
        if (new_id.length() <= 2) {
            new_id += String.valueOf(new_id.charAt(new_id.length() - 1))
                .repeat(3 - new_id.length());
        }

        return new_id;
    }
}