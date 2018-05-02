package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {
	public static void WhatFriend(Friend friend) {// declare method to differentiate what kind of friend the class is.
		if(friend instanceof ClassFriend) {// if the parameter friend is instance of ClassFriend,
			((ClassFriend)friend).classFriend();// initiate method classFriend.
		}
		else if(friend instanceof SchoolFriend) {// else if the parameter friend is instance of SchoolFriend,
			((SchoolFriend)friend).schoolFriend();// initiate method schoolFriend.
		}
		else {
			friend.justFriend();// or else, initiate method justFriend.
		}
	}
}
