class Solution {
    public int numUniqueEmails(String[] emails) {
        
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < emails.length; i++) {

        String email = emails[i];

        String local = email.substring(0, email.indexOf('@'));
        local = local.replace(".", "");

        System.out.println(local);

        if(local.indexOf('+') >= 0) {
            local = local.substring(0, local.indexOf('+'));
        }
        
        String domain = email.substring(email.indexOf('@'), email.length());

        if(!set.contains(local + domain)) {
            set.add(local + domain);
        }

        } 
        return set.size();
        

    }
}