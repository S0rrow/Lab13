package edu.handong.csee.java.lab13.prob1;

public class Prob1Acto {// declare a class for main method.
	public static void main(String args[]) {// declare main method to use instances.
		Friend friend1 = new Friend();// declare instance as Friend.
		SchoolFriend friend2 = new SchoolFriend();// declare instance as SchoolFriend.
		ClassFriend friend3 = new ClassFriend();// declare instance as ClassFriend.
		
		InstanceOf.WhatFriend(friend1);
		InstanceOf.WhatFriend(friend2);
		InstanceOf.WhatFriend(friend3);// initiate methods to check what kind of friend this instance is.
	}
}
