package com.gudi.project.dto;


public class Like_listDTO {
   private String mem_num;
   private String board_num;
   private String like_state;
   
   public String getLike_state() {
	return like_state;
}
public void setLike_state(String like_state) {
	this.like_state = like_state;
}
public String getMem_num() {
      return mem_num;
   }
   public void setMem_num(String mem_num) {
      this.mem_num = mem_num;
   }
   public String getBoard_num() {
      return board_num;
   }
   public void setBoard_num(String board_num) {
      this.board_num = board_num;
   }
   
}