package at.hoeselm.exercises8.exercise4

class Mozart(val volume: Int) {

  private val duration = 250

  def play(notes: Seq[Int]) = {

    lazy val synth = javax.sound.midi.MidiSystem.getSynthesizer
    synth.open()
    lazy val channel = synth.getChannels.head

    for (note <- notes) {
      channel.noteOn(note, volume)
      Thread.sleep(duration)
      channel.noteOn(note, 0)
    }

    synth.close()

  }

}