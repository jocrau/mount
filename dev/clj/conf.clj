(ns conf
  (:require
    [mount.core :as mount :refer [defstate]]
    [clojure.edn :as edn]))

(defstate config
          :start (-> "dev/resources/config.edn"
                     slurp
                     edn/read-string))
