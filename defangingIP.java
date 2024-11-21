class defangingIP {
    public String defangIPaddr(String address) {
        String answer = "";
        for(int i=0; i < address.length(); i++){
            char ch = address.charAt(i);

            if(ch == '.'){
                answer += "[.]";
            }
            else{
                answer += ch;
            }
        }
        return answer;
    }
}