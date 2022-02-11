case class Student(name: String, exams: List[Exam])
case class Exam(courseId: String, grade: Double)
case class Course(id: String, name: String)

def generatePassedExams(
    students: List[Student], courses: List[Course]): List[(String, String, Double)] = {
    for {
        s <- students
        e <- s.exams
        if e.grade > 2
        c <- courses
        if e.courseId == c.id
    } yield (s.name, c.name, e.grade)
}

def generatePassedExams2(students: List[Student],
    courses: List[Course]): List[(String, String, Int)] =
        students.flatMap { s =>
            s.exams
            .filter(_.grade > 2)
            .flatMap { e =>
                courses
                .filter(c => e.courseId == c.id)
                .map(c => (s.name, c.name, e.grade))
    }
}