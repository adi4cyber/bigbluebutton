package org.bigbluebutton.core.messages

abstract class InMessage

case class CreateMeeting(id: String) extends InMessage
case class DestroyMeeting(id: String) extends InMessage
case class StartMeeting(id: String) extends InMessage
case class EndMeeting(id: String) extends InMessage
case class UserJoin(id: String, name: String) extends InMessage
case class UserLeft(id: String) extends InMessage



// Value Objects
case class MeetingVO(id: String, recorded: Boolean)