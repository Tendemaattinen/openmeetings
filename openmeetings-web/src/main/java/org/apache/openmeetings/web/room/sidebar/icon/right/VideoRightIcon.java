/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License") +  you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openmeetings.web.room.sidebar.icon.right;

import org.apache.openmeetings.db.entity.room.Room.Right;

public class VideoRightIcon extends RoomRightIcon {
	private static final long serialVersionUID = 1L;

	public VideoRightIcon(String id, String uid) {
		super(id, uid, Right.VIDEO);
		mainCssClass = "right camera ";
	}

	@Override
	protected String getTitle() {
		return getString(String.format("ulist.right.video.%s", isSelf() ? "request" : (hasRight() ? "revoke" : "grant")));
	}

	@Override
	protected boolean visible() {
		return !getRoom().isAudioOnly() && super.visible();
	}
}
