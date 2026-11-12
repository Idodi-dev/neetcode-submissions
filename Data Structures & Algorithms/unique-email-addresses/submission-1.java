class Solution {
    public int numUniqueEmails(String[] emails) {
        
        HashSet<String> set = new HashSet<>();

        for(String email : emails) {

            int indexOfAt = email.indexOf('@');    

            String local = email.substring(0, indexOfAt);
            local = local.replace(".", "");

            System.out.println(local);

            int indexOfPlus = local.indexOf('+');

            if(indexOfPlus >= 0) {
                local = local.substring(0, indexOfPlus);
            }
            
            String domain = email.substring(indexOfAt, email.length());

            String full = local + domain;

            if(!set.contains(full)) {
                set.add(full);
            }

        } 
        return set.size();
        

    }
}