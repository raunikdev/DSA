class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count =0;
        int numberline =0;
        for(int i=0;i<moves.length();i++){
            char move = moves.charAt(i);
            if(move == 'L'){
                numberline -= 1;
            }else if(move == 'R'){
                numberline +=1;
            }else{
                count++;
            }
        }
        if(numberline>0){
            return numberline+count;
        }else{
            return -(numberline-count);
        }
    }
}