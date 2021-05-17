(defproject com.kephale/random-forests-clj "0.2.0"
  :description "An implementation of Random Forests for classification in Clojure"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [clojure-csv/clojure-csv "2.0.2"]
                 [org.clojure/math.combinatorics "0.1.6"]
                 [clj-tokenizer "0.1.0"]
                 [org.clojure/tools.cli "1.0.206"]]
   :main random-forests.train)
