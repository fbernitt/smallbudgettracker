(ns smallbudgettracker.core
  (:gen-class )
  (:require [smallbudgettracker.category]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (println "Hello, World!"))


(defn parse-file [filename]
  (load-file filename))
