import { IStudent } from 'app/shared/model/student.model';
import { IProject } from 'app/shared/model/project.model';

export interface ITeam {
    id?: string;
    name?: string;
    status?: string;
    students?: IStudent[];
    project?: IProject;
}

export class Team implements ITeam {
    constructor(
        public id?: string,
        public name?: string,
        public status?: string,
        public students?: IStudent[],
        public project?: IProject
    ) {}
}
