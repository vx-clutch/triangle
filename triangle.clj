(ns triangle)

(print "a> ")
(flush)
(def a (read-line))

(print "b> ")
(flush)
(def b (read-line))

(print "c> ")
(flush)
(def c (read-line))

(when (= a b c)
  (println "Your triangle is equilateral")
  (System/exit 0))

(when (or (= a b) (= a c) (= b c))
  (println "Your triangle is isoceles")
  (System/exit 0))

(println "Your triangle is scalene")
