package com.gdg.hydroid.activities101;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
	public String fName;
	public String lName;

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(fName);
		dest.writeString(lName);
	}

	public static final Parcelable.Creator<User> CREATOR = new Creator<User>() {

		@Override
		public User[] newArray(int size) {
			return null;
		}

		@Override
		public User createFromParcel(Parcel source) {
			User user = new User();
			user.fName = source.readString();
			user.lName = source.readString();
			return user;
		}
	};
}
