package at.hoeselm.exercises2

object Exercise6 {

  def main(args: List[String]): Unit = {
    val input_string = "Frank,123 Main,925-555-1943,95122"
    
    // solution1
    val pattern1 = """.*(\d\d\d)-(\d\d\d)-(\d\d\d\d),\d\d\d\d\d.*""".r
    val pattern1(phone_number_1_1, phone_number_1_2, phone_number_1_3) = input_string
    println(phone_number_1_1, phone_number_1_2, phone_number_1_3)

    // solution2
    val pattern2 = """.*(\d{3})-(\d{3})-(\d{4}),\d{5}.*""".r
    val pattern2(phone_number_2_1,phone_number_2_2,phone_number_2_3) = input_string
    println(phone_number_2_1, phone_number_2_2, phone_number_2_3)
    
    // proceeding with solution 2
    phone_number_2_1.toInt
    phone_number_2_2.toInt
    phone_number_2_3.toInt
    
    val phone_number_2_tupe = (phone_number_2_1,phone_number_2_2,phone_number_2_3)
    println("Telephone Number Tuple: " + phone_number_2_tupe)
    
  }

}